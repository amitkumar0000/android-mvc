# android-mvc

MVC mode


View    Contoller   model

Model : it is place where data and business logic resides.
Controller : Incharge which take care of updating model
            and notify view for underlying changes
            
View : User interface ,on Notify, get Data from models 
            View has reference of controller and model 

In Android

Activiy class can act as both view and contoller.

Controller can be seperate class holding a reference of view class and model class

Contoller is not only class to notify view about model update.

Model can have lots of observers . On data update, model can
notify all its observers.



