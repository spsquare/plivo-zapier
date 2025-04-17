public class SendEmailAction implements IAction{

    @Override
    public String getActionName(){
        return "send-mail";
    }
    @Override
    ResponseBody runAction(AuthContext authDetails, GmailInput input){
        return post("<url-for-mail>",<request-body constructed from input>);
    }

}