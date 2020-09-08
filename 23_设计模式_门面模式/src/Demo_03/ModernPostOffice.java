package Demo_03;

public class ModernPostOffice {
    private ILetterProcess letterProcess = new LetterProcessImpl();
    private LetterPolice police = new LetterPolice();

    public void sendLetter(String context, String address) {
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        police.checkLetter(letterProcess);
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }


}
