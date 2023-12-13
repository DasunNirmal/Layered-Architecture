package lk.ijse;

public class Boy {
    private Agreement agreement;

    public void setAgreement(Agreement agreement) {
        this.agreement = agreement;
    }

    public void chatWithGirl(){
        agreement.chat();
    }

    public static void main(String[] args) {

        Boy boy = new Boy();
        boy.setAgreement(new Girl());
        boy.chatWithGirl();
    }
}
