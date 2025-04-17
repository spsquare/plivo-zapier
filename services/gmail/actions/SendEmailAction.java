public class SendEmailAction implements IAction{

    @Override
    public String getActionName(){
        return "send-mail";
    }
    ResponseBody runAction(String authDetails, GmailInput input){
        return post("<url-for-mail>",<request-body constructed from input>);
    }

}