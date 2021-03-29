# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    OpenAPI spec version: 1.0.0
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest

import petstore_api
from petstore_api.models.type_holder_default import TypeHolderDefault  # noqa: E501
from petstore_api.rest import ApiException


class TestTypeHolderDefault(unittest.TestCase):
    """TypeHolderDefault unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testTypeHolderDefault(self):
        """Test TypeHolderDefault"""
        # required_vars are set to None now until swagger-parser/swagger-core fixes
        # https://github.com/swagger-api/swagger-parser/issues/971
        array_item = [1, 2, 3]
        model = TypeHolderDefault(array_item=array_item)
        self.assertEqual(model.string_item, 'what')
        self.assertEqual(model.bool_item, True)


if __name__ == '__main__':
    unittest.main()
