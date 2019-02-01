public class Igor {
    private boolean isOpSlot = true;

    public void setIsOpSlot(boolean value) {
        isOpSlot = value;
    }

    public boolean getIsOpSlot() {
        return isOpSlot;
    }

    public void OpenDeur() {
        if (isOpSlot) {
            setIsOpSlot(false);
        } else if (!isOpSlot) {
            setIsOpSlot(true);
        }
    }
}