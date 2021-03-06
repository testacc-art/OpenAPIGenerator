using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using Org.OpenAPITools.Client;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Test
{
	/// <summary>
	///  Class for testing PetApi
	/// </summary>
	/// <remarks>
	/// This file is automatically generated by Swagger Codegen.
	/// Please update the test case below to test the API endpoint.
	/// </remarks>
	public class PetApiTests
	{
		private PetApi instance;

		private long petId = 11088;

		/// <summary>
		/// Create a Pet object
		/// </summary>
		private Pet createPet()
		{
			// create pet
			Pet p = new Pet(name: "Csharp test", photoUrls: new List<string> { "http://petstore.com/csharp_test" });
			p.Id = petId;
			//p.Name = "Csharp test";
			p.Status = Pet.StatusEnum.Available;
			// create Category object
			Category category = new Category();
			category.Id = 56;
			category.Name = "sample category name2";
			List<String> photoUrls = new List<String>(new String[] { "sample photoUrls" });
			// create Tag object
			Tag tag = new Tag();
			tag.Id = petId;
			tag.Name = "csharp sample tag name1";
			List<Tag> tags = new List<Tag>(new Tag[] { tag });
			p.Tags = tags;
			p.Category = category;
			p.PhotoUrls = photoUrls;

			return p;
		}

		/// <summary>
		/// Convert string to byte array
		/// </summary>
		private byte[] GetBytes(string str)
		{
			byte[] bytes = new byte[str.Length * sizeof(char)];
			System.Buffer.BlockCopy(str.ToCharArray(), 0, bytes, 0, bytes.Length);
			return bytes;
		}

		/// <summary>
		/// Setup before each unit test
		/// </summary>
		[SetUp]
		public void Init()
		{
			instance = new PetApi();

			// create pet
			Pet p = createPet();

			// add pet before testing
			PetApi petApi = new PetApi("http://petstore.swagger.io/v2/");
			petApi.AddPet(p);
		}

		/// <summary>
		/// Clean up after each unit test
		/// </summary>
		[TearDown]
		public void Cleanup()
		{
			// remove the pet after testing
			PetApi petApi = new PetApi();
			petApi.DeletePet(petId, "test key");
		}

		/// <summary>
		/// Test an instance of PetApi
		/// </summary>
		[Test]
		public void InstanceTest()
		{
            Assert.IsInstanceOf(typeof(PetApi), instance);
		}


		/// <summary>
		/// Test AddPet
		/// </summary>
		[Test]
		public void AddPetTest()
		{
			// create pet
			Pet p = createPet();
			instance.AddPet(p);
		}

		/// <summary>
		/// Test DeletePet
		/// </summary>
		[Test]
		public void DeletePetTest()
		{
			// no need to test as it'c covered by Cleanup() already
		}

		/// <summary>
		/// Test FindPetsByStatus
		/// </summary>
		[Test]
		public void FindPetsByStatusTest()
		{
			PetApi petApi = new PetApi();
			List<String> tagsList = new List<String>(new String[] { "available" });

			List<Pet> listPet = petApi.FindPetsByTags(tagsList);
			foreach (Pet pet in listPet) // Loop through List with foreach.
			{
				Assert.IsInstanceOf(typeof(Pet), pet);
				Assert.AreEqual("csharp sample tag name1", pet.Tags[0]);
			}
		}

		/// <summary>
		/// Test FindPetsByTags
		/// </summary>
		[Test]
		public void FindPetsByTagsTest()
		{
			List<string> tags = new List<String>(new String[] { "pet" });
			var response = instance.FindPetsByTags(tags);
            Assert.IsInstanceOf(typeof(List<Pet>), response);
		}

		/// <summary>
		/// Test GetPetById
		/// </summary>
		[Test]
		public void GetPetByIdTest()
		{
			// set timeout to 10 seconds
			Configuration c1 = new Configuration();
			c1.Timeout = 10000;
			c1.UserAgent = "TEST_USER_AGENT";

			PetApi petApi = new PetApi(c1);
			Pet response = petApi.GetPetById(petId);
            Assert.IsInstanceOf(typeof(Pet), response);

			Assert.AreEqual("Csharp test", response.Name);
			Assert.AreEqual(Pet.StatusEnum.Available, response.Status);

            Assert.IsInstanceOf(typeof(List<Tag>), response.Tags);
			Assert.AreEqual(petId, response.Tags[0].Id);
			Assert.AreEqual("csharp sample tag name1", response.Tags[0].Name);

            Assert.IsInstanceOf(typeof(List<String>), response.PhotoUrls);
			Assert.AreEqual("sample photoUrls", response.PhotoUrls[0]);

            Assert.IsInstanceOf(typeof(Category), response.Category);
			Assert.AreEqual(56, response.Category.Id);
			Assert.AreEqual("sample category name2", response.Category.Name);
		}

		/// <summary>
		/// Test GetPetByIdAsync
		/// </summary>
		[Test()]
		public void TestGetPetByIdAsync()
		{
			PetApi petApi = new PetApi();
			var task = petApi.GetPetByIdAsync(petId);
			Pet response = task.Result;
			Assert.IsInstanceOf(typeof(Pet), response);

			Assert.AreEqual("Csharp test", response.Name);
			Assert.AreEqual(Pet.StatusEnum.Available, response.Status);

            Assert.IsInstanceOf(typeof(List<Tag>), response.Tags);
			Assert.AreEqual(petId, response.Tags[0].Id);
			Assert.AreEqual("csharp sample tag name1", response.Tags[0].Name);

            Assert.IsInstanceOf(typeof(List<String>), response.PhotoUrls);
			Assert.AreEqual("sample photoUrls", response.PhotoUrls[0]);

            Assert.IsInstanceOf(typeof(Category), response.Category);
			Assert.AreEqual(56, response.Category.Id);
			Assert.AreEqual("sample category name2", response.Category.Name);
		}

		/// <summary>
		/// Test GetPetByIdAsyncWithHttpInfo
		/// </summary>
		[Test()]
		public void TestGetPetByIdAsyncWithHttpInfo()
		{
			PetApi petApi = new PetApi();
			var task = petApi.GetPetByIdAsyncWithHttpInfo(petId);

			Assert.AreEqual(200, task.Result.StatusCode);
			Assert.IsTrue(task.Result.Headers.ContainsKey("Content-Type"));
			Assert.AreEqual(task.Result.Headers["Content-Type"], "application/json");

			Pet response = task.Result.Data;
            Assert.IsInstanceOf(typeof(Pet), response);

			Assert.AreEqual("Csharp test", response.Name);
			Assert.AreEqual(Pet.StatusEnum.Available, response.Status);

            Assert.IsInstanceOf(typeof(List<Tag>), response.Tags);
			Assert.AreEqual(petId, response.Tags[0].Id);
			Assert.AreEqual("csharp sample tag name1", response.Tags[0].Name);

            Assert.IsInstanceOf(typeof(List<String>), response.PhotoUrls);
			Assert.AreEqual("sample photoUrls", response.PhotoUrls[0]);

            Assert.IsInstanceOf(typeof(Category), response.Category);
			Assert.AreEqual(56, response.Category.Id);
			Assert.AreEqual("sample category name2", response.Category.Name);
		}

		/// <summary>
		/// Test UpdatePet
		/// </summary>
		[Test]
		public void UpdatePetTest()
		{
			// create pet
			Pet p = createPet();
			instance.UpdatePet(p);
		}

		/// <summary>
		/// Test UpdatePetWithForm
		/// </summary>
		[Test]
		public void UpdatePetWithFormTest()
		{
			PetApi petApi = new PetApi();
			petApi.UpdatePetWithForm(petId, "new form name", "pending");

			Pet response = petApi.GetPetById(petId);
            Assert.IsInstanceOf(typeof(Pet), response);
            Assert.IsInstanceOf(typeof(Category), response.Category);
            Assert.IsInstanceOf(typeof(List<Tag>), response.Tags);

			Assert.AreEqual("new form name", response.Name);
			Assert.AreEqual(Pet.StatusEnum.Pending, response.Status);

			Assert.AreEqual(petId, response.Tags[0].Id);
			Assert.AreEqual(56, response.Category.Id);

			// test optional parameter
			petApi.UpdatePetWithForm(petId, "new form name2");
			Pet response2 = petApi.GetPetById(petId);
			Assert.AreEqual("new form name2", response2.Name);
		}

		/// <summary>
		/// Test UploadFile
		/// </summary>
		[Test]
		public void UploadFileTest()
		{
			Assembly _assembly = Assembly.GetExecutingAssembly();
			Stream _imageStream = _assembly.GetManifestResourceStream("Org.OpenAPITools.Test.linux-logo.png");
			PetApi petApi = new PetApi();
			// test file upload with form parameters
			petApi.UploadFile(petId, "new form name", _imageStream);

			// test file upload without any form parameters
			// using optional parameter syntax introduced at .net 4.0
			petApi.UploadFile(petId: petId, file: _imageStream);

		}

		/// <summary>
		/// Test status code
		/// </summary>
		[Test()]
		public void TestStatusCodeAndHeader()
		{
			PetApi petApi = new PetApi();
			var response = petApi.GetPetByIdWithHttpInfo(petId);
			Assert.AreEqual(response.StatusCode, 200);
			Assert.IsTrue(response.Headers.ContainsKey("Content-Type"));
			Assert.AreEqual(response.Headers["Content-Type"], "application/json");
		}

		/// <summary>
		/// Test default header (should be deprecated
		/// </summary>
		[Test()]
		public void TestDefaultHeader()
		{
			PetApi petApi = new PetApi();
			// commented out the warning test below as it's confirmed the warning is working as expected
			// there should be a warning for using AddDefaultHeader (deprecated) below
			//petApi.AddDefaultHeader ("header_key", "header_value");
			// the following should be used instead as suggested in the doc
			petApi.Configuration.AddDefaultHeader("header_key2", "header_value2");

		}

	}

}