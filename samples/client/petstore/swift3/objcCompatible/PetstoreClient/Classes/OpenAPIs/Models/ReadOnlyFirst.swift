//
// ReadOnlyFirst.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class ReadOnlyFirst: JSONEncodable {

    public var bar: String?
    public var baz: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["bar"] = self.bar
        nillableDictionary["baz"] = self.baz

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

