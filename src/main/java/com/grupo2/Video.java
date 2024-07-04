package com.grupo2;

public class Video {
    private String claimStatus;
    private long videoId;
    private int videoDurationSec;
    private String videoTranscriptionText;
    private String verifiedStatus;
    private String authorBanStatus;
    private int videoViewCount;
    private int videoLikeCount;
    private int videoShareCount;
    private int videoDownloadCount;
    private int videoCommentCount;

    public Video(
            String claimStatus,
            long videoId,
            int videoDurationSec,
            String videoTranscriptionText,
            String verifiedStatus,
            String authorBanStatus,
            int videoViewCount,
            int videoLikeCount,
            int videoShareCount,
            int videoDownloadCount,
            int videoCommentCount) {
        this.claimStatus = claimStatus;
        this.videoId = videoId;
        this.videoDurationSec = videoDurationSec;
        this.videoTranscriptionText = videoTranscriptionText;
        this.verifiedStatus = verifiedStatus;
        this.authorBanStatus = authorBanStatus;
        this.videoViewCount = videoViewCount;
        this.videoLikeCount = videoLikeCount;
        this.videoShareCount = videoShareCount;
        this.videoDownloadCount = videoDownloadCount;
        this.videoCommentCount = videoCommentCount;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }

    public long getVideoId() {
        return videoId;
    }

    public void setVideoId(long videoId) {
        this.videoId = videoId;
    }

    public int getVideoDurationSec() {
        return videoDurationSec;
    }

    public void setVideoDurationSec(int videoDurationSec) {
        this.videoDurationSec = videoDurationSec;
    }

    public String getVideoTranscriptionText() {
        return videoTranscriptionText;
    }

    public void setVideoTranscriptionText(String videoTranscriptionText) {
        this.videoTranscriptionText = videoTranscriptionText;
    }

    public String getVerifiedStatus() {
        return verifiedStatus;
    }

    public void setVerifiedStatus(String verifiedStatus) {
        this.verifiedStatus = verifiedStatus;
    }

    public String getAuthorBanStatus() {
        return authorBanStatus;
    }

    public void setAuthorBanStatus(String authorBanStatus) {
        this.authorBanStatus = authorBanStatus;
    }

    public int getVideoViewCount() {
        return videoViewCount;
    }

    public void setVideoViewCount(int videoViewCount) {
        this.videoViewCount = videoViewCount;
    }

    public int getVideoLikeCount() {
        return videoLikeCount;
    }

    public void setVideoLikeCount(int videoLikeCount) {
        this.videoLikeCount = videoLikeCount;
    }

    public int getVideoShareCount() {
        return videoShareCount;
    }

    public void setVideoShareCount(int videoShareCount) {
        this.videoShareCount = videoShareCount;
    }

    public int getVideoDownloadCount() {
        return videoDownloadCount;
    }

    public void setVideoDownloadCount(int videoDownloadCount) {
        this.videoDownloadCount = videoDownloadCount;
    }

    public int getVideoCommentCount() {
        return videoCommentCount;
    }

    public void setVideoCommentCount(int videoCommentCount) {
        this.videoCommentCount = videoCommentCount;
    }
}
