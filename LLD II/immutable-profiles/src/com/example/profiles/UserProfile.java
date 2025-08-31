package com.example.profiles;

/**
 * Mutable and confusing. Multiple constructors + setters.
 */
public final class UserProfile {
    private final String id;
    private final String email;
    private final String phone;
    private final String displayName;
    private final String address;
    private final boolean marketingOptIn;
    private final String twitter;
    private final String github;

    private UserProfile(Builder builder) {
        this.id = builder.id;
        this.email = builder.email;
        this.phone = builder.phone;
        this.displayName = builder.displayName;
        this.address = builder.address;
        this.marketingOptIn = builder.marketingOptIn;
        this.twitter = builder.twitter;
        this.github = builder.github;
    }

//    public UserProfile(String id, String email) {
//        this.id = id;
//        this.email = email;
//    }
//
//    public UserProfile(String id, String email, String phone) {
//        this(id, email);
//        this.phone = phone;
//    }

    // many setters — mutability leaks
//    public void setId(String id) { this.id = id; }
//    public void setEmail(String email) { this.email = email; }
//    public void setPhone(String phone) { this.phone = phone; }
//    public void setDisplayName(String displayName) { this.displayName = displayName; }
//    public void setAddress(String address) { this.address = address; }
//    public void setMarketingOptIn(boolean marketingOptIn) { this.marketingOptIn = marketingOptIn; }
//    public void setTwitter(String twitter) { this.twitter = twitter; }
//    public void setGithub(String github) { this.github = github; }

    // getters
    public String getId() { return id; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getDisplayName() { return displayName; }
    public String getAddress() { return address; }
    public boolean isMarketingOptIn() { return marketingOptIn; }
    public String getTwitter() { return twitter; }
    public String getGithub() { return github; }

    public static class  Builder{
        public String id;
        public String email;
        public String phone;
        public String displayName;
        public String address;
        public boolean marketingOptIn;
        public String twitter;
        public String github;
        public Builder setId(String id) { this.id = id; return this; }
        public Builder setEmail(String email) { this.email = email; return this; }
        public Builder setPhone(String phone) { this.phone = phone; return this; }
        public Builder setDisplayName(String displayName) { this.displayName = displayName; return this; }
        public Builder setAddress(String address) { this.address = address; return this; }
        public Builder setMarketingOptIn(boolean marketingOptIn) { this.marketingOptIn = marketingOptIn; return this; }
        public Builder setTwitter(String twitter) { this.twitter = twitter; return this; }
        public Builder setGithub(String github) { this.github = github; return this; }
        public UserProfile build() {
            return new UserProfile(this);
        }
    }
}
