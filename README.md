# Assignment of TectVista 

Hi! I'm Umar Manzoor. This my final submission. This project have the following things implemented in it. 

- MVVM with Clean Architecture
- Dependency Injection (Module , Components & Sub Components)
- Retrofit for network communication 
- Room DB for Local Storage
-  Repository Layer
- Kotlin Coroutines
- Data Binding 
- View binding 




# Files Structure
```
Project 
|
|  App.kt
└- Data 
|   └---API
|   |      Post Service 
|   └---DB
|   |      PostDAO
|   |      Posts DataBase
|   └---Model
|   |      Posts
|   |      Post Item
|   └---Repository
|   |      └---Post  
|   |      		Post Repository Implemetation
|   |      		└---Data Source
|   |      		|     Post Local Data Source 
|   |      		|     Post Remote Data Source
|   |      		└---Data Source Implementation
|   |           	 Post Local Data Source Implementation
|   |            	Post Remote Data SourceImplementation
└- Domain 
|   └---Repository
|   |      Post Repository
|   └---Usecase
|   |      Get Post By ID Usecase
|   |      Get All Post Usecase
|   |      Update Post Usecase
└- Presentation 
    └--- Dependency Injection 
    |      └---Core
    |      |      AppComponent
    |      |     AppModule 
    |      |      Injector
    |      |      DataBase Module 
    |      |      Local Data Module
    |      |      Net Module
    |      |      Remote Database Module 
    |      |      Repository Module
    |      |      Usecase Module
    |      └---Post Details
    |      |      Post Detail Module
    |      |      Post Detail Scope
    |      |      Post Detail Subcomponent
    |      └---Post List 
    |            Post List Module
    |            Post List Scope
    |            Post List Subcomponent
    └---Post List 
    |      MainActivity 
    |      Post List ViewModel
    |      Post List ViewModel Factory
    |      Post List Adaptor
    └---Post Detail
		   PostDetail Activity 
		   Post Detail ViewModel
		   Post DetailViewModel Factory
```

