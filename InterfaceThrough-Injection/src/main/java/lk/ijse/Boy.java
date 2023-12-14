package lk.ijse;

public class Boy implements DI {
    private Agreement agreement;

    public void chatWithGirl(){
        agreement.chat();
    }

    @Override
    public void inject(Agreement agreement) {
        this.agreement = agreement;
    }

    public static void main(String[] args) {

        Boy boy = new Boy();
        boy.inject(new Girl());
        boy.chatWithGirl();
    }
}
