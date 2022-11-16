import java.util.ArrayList;

public class SocialMediaMain {
    public enum PostType{
        TWEET,COMMENT
    }

    public enum LikeTypes {
        AWESOME,SAD,THUMBSUP,HEART
    }

    public class User {
        private String userName;
        private String userId;
        private String email;
        private String password;
        private Number contactNumber;

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Number getContactNumber() {
            return contactNumber;
        }

        public void setContactNumber(Number contactNumber) {
            this.contactNumber = contactNumber;
        }

    }

    public class Like {
        private RegisteredAccount user;
        private LikeTypes likeType;
        private PostType type;

        public Like(RegisteredAccount ra, LikeTypes type, PostType comment) {
            this.user = ra;
            this.likeType = type;
            this.type = comment;
        }
    }

    public class Comment {
        private RegisteredAccount user;
        private String content;
        private ArrayList<Like> likes = new ArrayList<Like>();

        public String getContent() {
            return content;
        }

        public void addLike(RegisteredAccount ra, LikeTypes type) {
            likes.add(new Like(ra, type, PostType.COMMENT));
        }

        public void removeLike(RegisteredAccount ra, LikeTypes types) {
            //to be implemented as when the likes array consist of the reg accnt then remove that entry from likes array.
        }

        public class CommentThread {
            private String threadId;
            private ArrayList<Comment> comments;

            public CommentThread(String threadId) {
                this.threadId = threadId;
                comments = new ArrayList<Comment>();
            }

            public ArrayList<Comment> getComments() {
                return comments;
            }

            public void addComment(Comment comment) {
                comments.add(comment);
            }
        }
    }


}
