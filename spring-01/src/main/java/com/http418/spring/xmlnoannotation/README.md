#### Module: XML, no annotation
* Before Spring 2.5, instead of annotations, all the configurations were made using XML.  
Here we create an example of this method to implement Spring applications using an example to autowire.
* In this example, the beans that would be created using the @Component annotation for XmlJdbcConnection and XmlPersonDAO 
are created at the applicationContext.xml file. At the same file, we created a dependency injection using the ref tag 
inside the beans (same effect of @Autowired).
    * applicationContext.xml is created inside src\main\resources\applicationContext.xml
