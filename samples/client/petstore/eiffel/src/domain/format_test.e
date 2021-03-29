note
 description:"[
		OpenAPI Petstore
 		This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
  		OpenAPI spec version: 1.0.0
 	    

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class FORMAT_TEST 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    integer: INTEGER_32 
      
    int32: INTEGER_32 
      
    int64: INTEGER_64 
      
    number: REAL_32 
      
    float: REAL_32 
      
    double: REAL_64 
      
    string: detachable STRING_32 
      
    byte: detachable ARRAY [NATURAL_8] 
      
    binary: detachable FILE 
      
    date: detachable DATE 
      
    date_time: detachable DATE_TIME 
      
    uuid: detachable UUID 
      
    password: detachable STRING_32 
      

feature -- Change Element  
 
    set_integer (a_name: like integer)
        -- Set 'integer' with 'a_name'.
      do
        integer := a_name
      ensure
        integer_set: integer = a_name		
      end

    set_int32 (a_name: like int32)
        -- Set 'int32' with 'a_name'.
      do
        int32 := a_name
      ensure
        int32_set: int32 = a_name		
      end

    set_int64 (a_name: like int64)
        -- Set 'int64' with 'a_name'.
      do
        int64 := a_name
      ensure
        int64_set: int64 = a_name		
      end

    set_number (a_name: like number)
        -- Set 'number' with 'a_name'.
      do
        number := a_name
      ensure
        number_set: number = a_name		
      end

    set_float (a_name: like float)
        -- Set 'float' with 'a_name'.
      do
        float := a_name
      ensure
        float_set: float = a_name		
      end

    set_double (a_name: like double)
        -- Set 'double' with 'a_name'.
      do
        double := a_name
      ensure
        double_set: double = a_name		
      end

    set_string (a_name: like string)
        -- Set 'string' with 'a_name'.
      do
        string := a_name
      ensure
        string_set: string = a_name		
      end

    set_byte (a_name: like byte)
        -- Set 'byte' with 'a_name'.
      do
        byte := a_name
      ensure
        byte_set: byte = a_name		
      end

    set_binary (a_name: like binary)
        -- Set 'binary' with 'a_name'.
      do
        binary := a_name
      ensure
        binary_set: binary = a_name		
      end

    set_date (a_name: like date)
        -- Set 'date' with 'a_name'.
      do
        date := a_name
      ensure
        date_set: date = a_name		
      end

    set_date_time (a_name: like date_time)
        -- Set 'date_time' with 'a_name'.
      do
        date_time := a_name
      ensure
        date_time_set: date_time = a_name		
      end

    set_uuid (a_name: like uuid)
        -- Set 'uuid' with 'a_name'.
      do
        uuid := a_name
      ensure
        uuid_set: uuid = a_name		
      end

    set_password (a_name: like password)
        -- Set 'password' with 'a_name'.
      do
        password := a_name
      ensure
        password_set: password = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass FORMAT_TEST%N")
        if attached integer as l_integer then
          Result.append ("%Ninteger:")
          Result.append (l_integer.out)
          Result.append ("%N")    
        end  
        if attached int32 as l_int32 then
          Result.append ("%Nint32:")
          Result.append (l_int32.out)
          Result.append ("%N")    
        end  
        if attached int64 as l_int64 then
          Result.append ("%Nint64:")
          Result.append (l_int64.out)
          Result.append ("%N")    
        end  
        if attached number as l_number then
          Result.append ("%Nnumber:")
          Result.append (l_number.out)
          Result.append ("%N")    
        end  
        if attached float as l_float then
          Result.append ("%Nfloat:")
          Result.append (l_float.out)
          Result.append ("%N")    
        end  
        if attached double as l_double then
          Result.append ("%Ndouble:")
          Result.append (l_double.out)
          Result.append ("%N")    
        end  
        if attached string as l_string then
          Result.append ("%Nstring:")
          Result.append (l_string.out)
          Result.append ("%N")    
        end  
        if attached byte as l_byte then
          Result.append ("%Nbyte:")
          Result.append (l_byte.out)
          Result.append ("%N")    
        end  
        if attached binary as l_binary then
          Result.append ("%Nbinary:")
          Result.append (l_binary.out)
          Result.append ("%N")    
        end  
        if attached date as l_date then
          Result.append ("%Ndate:")
          Result.append (l_date.out)
          Result.append ("%N")    
        end  
        if attached date_time as l_date_time then
          Result.append ("%Ndate_time:")
          Result.append (l_date_time.out)
          Result.append ("%N")    
        end  
        if attached uuid as l_uuid then
          Result.append ("%Nuuid:")
          Result.append (l_uuid.out)
          Result.append ("%N")    
        end  
        if attached password as l_password then
          Result.append ("%Npassword:")
          Result.append (l_password.out)
          Result.append ("%N")    
        end  
      end
end


