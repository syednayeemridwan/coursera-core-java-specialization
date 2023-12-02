public class ClassicalCD extends Item {
    private String composer;
    private String performers[] = new String[5];
    private String recordingLocation;
    private Date releaseDate;

    private int performerCount = 0;

    public ClassicalCD(String composer, String recordingLocation, Date releaseDate) {
        super();
        setComposer(composer);
        setRecordingLocation(recordingLocation);
        setReleaseDate(releaseDate);
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getRecordingLocation() {
        return recordingLocation;
    }

    public void setRecordingLocation(String recordingLocation) {
        this.recordingLocation = recordingLocation;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void addPerformer(String performer) {
        if (performerCount < performers.length) {
            performers[performerCount] = performer;
            performerCount++;
        } else {
            System.out.println("There is no room left in performer array");
        }

    }

    public void showPerformers() {
        for (int i = 0; i <= performerCount; i++) {
            System.out.println(performers[i]);
        }
    }
}
