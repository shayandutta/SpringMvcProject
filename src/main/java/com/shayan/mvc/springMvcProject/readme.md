GET - for getting the resource
POST- create new resource
PUT - update the resource
DELETE - delete the resource
PATCH - partial update

//server application has to provide http method support
//api's that support http method
        @RequestMapping(value="/endpoint", method= RequestMethod.GET)