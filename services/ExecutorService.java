/**
 * Generic executor service which helps in calling the required Integration service.
 */
public class ExecutorService{

    //List of all services needed for the execution
    List<IService> services;
    ExecutorService(List<IService> services){
        this.services = services;
    }

    // Execution code
    public void execute(String serviceName,String actionName,Object input){
        // Finding the service
        IService executorService = null;
        for(Iservice service: services){
            if(service.getName().equals(serviceName)){
                executorService=service;
            }
        }
        // Finding the action
        Action<?,?> action = executorService.getActions().stream().filter(action -> action.getActionName().equals(actionName)).findFirst();
        if(action==null){
            throw new RunTimeException("No Action found");
        }
        //Executing the action
        return action.runAction(service.getAuthProvider().getAccessToken(),input);


    }
}