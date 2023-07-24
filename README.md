# Serialization-interface
Serialization is a marker interface with no method or data member.
You can serialize an object only by implementing the serializable interface
Serialization is the process of converting an object's state (its instance variables) into a byte stream or any other format file like .txt
that can be easily stored or transmitted. 
This allows you to save the object's state persistently or send it over a network to another Java application or system.
The byte stream can be written to a file, sent over a network, or stored in a database.
Note:   It is not human readable.


The serialization process only saves non-static data members, but not static or transient data members

****  fileOutputStream:FileOutputStream is a class in Java that is used to write binary data to a file. 
                       It allows you to create, open, and write data to a file on the file system. 
                       This class is commonly used when you need to save data (in binary form) to a file, such as when writing images, videos, or serialized objects.


objectOutputStream:  ObjectOutputStream is a class in Java that is used for object serialization. 
                     It allows you to convert objects into a binary stream (byte stream) that can be saved to a file or sent over a network.
                    Objects that you want to serialize must implement the Serializable interface.    



fileInputStream:FileInputStream is a class in Java that is used to read binary data from a file. 
                It allows you to open and read data from a file on the file system.
                This class is commonly used when you need to read binary data from a file, such as when reading images, videos, or serialized objects.

objectInputStream:ObjectInputStream is a class in Java that is used for object deserialization.  
                  It allows you to read a binary stream (byte stream) from a file or any other input stream and convert it back into an object. 
                  The class of the object that you want to deserialize must be available in the classpath.


Deserialization:  Deserialization in Java is the process of converting a binary stream (byte stream) of data back into an object. 
                  this is the reverse operation of serialization,
                  where objects are converted into a binary format for storage or transmission.
                  During deserialization, the binary data is read from a file, network stream, or any other input source,  
                  and then the data is used to reconstruct the original object along with its state (instance variables) and behavior (methods).
