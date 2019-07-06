public enum InstrumentType {
    GUITAR, BASS, MANDOLIN;

    public String toString() {
        switch (this) {
            case GUITAR:
                return "Guitar";
            case BASS:
                return "Bass";
            case MANDOLIN:
                return "Mandolin";
            default:
                return "Unspecified";
        }
    }
}
