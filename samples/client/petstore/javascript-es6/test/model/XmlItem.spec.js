/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.OpenApiPetstore);
  }
}(this, function(expect, OpenApiPetstore) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new OpenApiPetstore.XmlItem();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('XmlItem', function() {
    it('should create an instance of XmlItem', function() {
      // uncomment below and update the code to test XmlItem
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be.a(OpenApiPetstore.XmlItem);
    });

    it('should have the property attributeString (base name: "attribute_string")', function() {
      // uncomment below and update the code to test the property attributeString
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

    it('should have the property attributeNumber (base name: "attribute_number")', function() {
      // uncomment below and update the code to test the property attributeNumber
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

    it('should have the property attributeInteger (base name: "attribute_integer")', function() {
      // uncomment below and update the code to test the property attributeInteger
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

    it('should have the property attributeBoolean (base name: "attribute_boolean")', function() {
      // uncomment below and update the code to test the property attributeBoolean
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

    it('should have the property wrappedArray (base name: "wrapped_array")', function() {
      // uncomment below and update the code to test the property wrappedArray
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

    it('should have the property nameString (base name: "name_string")', function() {
      // uncomment below and update the code to test the property nameString
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

    it('should have the property nameNumber (base name: "name_number")', function() {
      // uncomment below and update the code to test the property nameNumber
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

    it('should have the property nameInteger (base name: "name_integer")', function() {
      // uncomment below and update the code to test the property nameInteger
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

    it('should have the property nameBoolean (base name: "name_boolean")', function() {
      // uncomment below and update the code to test the property nameBoolean
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

    it('should have the property nameArray (base name: "name_array")', function() {
      // uncomment below and update the code to test the property nameArray
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

    it('should have the property nameWrappedArray (base name: "name_wrapped_array")', function() {
      // uncomment below and update the code to test the property nameWrappedArray
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

    it('should have the property prefixString (base name: "prefix_string")', function() {
      // uncomment below and update the code to test the property prefixString
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

    it('should have the property prefixNumber (base name: "prefix_number")', function() {
      // uncomment below and update the code to test the property prefixNumber
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

    it('should have the property prefixInteger (base name: "prefix_integer")', function() {
      // uncomment below and update the code to test the property prefixInteger
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

    it('should have the property prefixBoolean (base name: "prefix_boolean")', function() {
      // uncomment below and update the code to test the property prefixBoolean
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

    it('should have the property prefixArray (base name: "prefix_array")', function() {
      // uncomment below and update the code to test the property prefixArray
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

    it('should have the property prefixWrappedArray (base name: "prefix_wrapped_array")', function() {
      // uncomment below and update the code to test the property prefixWrappedArray
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

    it('should have the property namespaceString (base name: "namespace_string")', function() {
      // uncomment below and update the code to test the property namespaceString
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

    it('should have the property namespaceNumber (base name: "namespace_number")', function() {
      // uncomment below and update the code to test the property namespaceNumber
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

    it('should have the property namespaceInteger (base name: "namespace_integer")', function() {
      // uncomment below and update the code to test the property namespaceInteger
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

    it('should have the property namespaceBoolean (base name: "namespace_boolean")', function() {
      // uncomment below and update the code to test the property namespaceBoolean
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

    it('should have the property namespaceArray (base name: "namespace_array")', function() {
      // uncomment below and update the code to test the property namespaceArray
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

    it('should have the property namespaceWrappedArray (base name: "namespace_wrapped_array")', function() {
      // uncomment below and update the code to test the property namespaceWrappedArray
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

    it('should have the property prefixNsString (base name: "prefix_ns_string")', function() {
      // uncomment below and update the code to test the property prefixNsString
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

    it('should have the property prefixNsNumber (base name: "prefix_ns_number")', function() {
      // uncomment below and update the code to test the property prefixNsNumber
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

    it('should have the property prefixNsInteger (base name: "prefix_ns_integer")', function() {
      // uncomment below and update the code to test the property prefixNsInteger
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

    it('should have the property prefixNsBoolean (base name: "prefix_ns_boolean")', function() {
      // uncomment below and update the code to test the property prefixNsBoolean
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

    it('should have the property prefixNsArray (base name: "prefix_ns_array")', function() {
      // uncomment below and update the code to test the property prefixNsArray
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

    it('should have the property prefixNsWrappedArray (base name: "prefix_ns_wrapped_array")', function() {
      // uncomment below and update the code to test the property prefixNsWrappedArray
      //var instane = new OpenApiPetstore.XmlItem();
      //expect(instance).to.be();
    });

  });

}));
