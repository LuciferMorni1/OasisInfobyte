package OnlineExamination;
//--ONLINE EXAMINATION APPLICATION--//

// User.java
class User {
    private String username;
    private String password;
    // Other user attributes, getters, and setters
}

// AuthenticationService.java
class AuthenticationService {
    public User login(String username, String password) {
        // Logic to authenticate the user
    }

    public void logout(User user) {
        // Logic to log out the user
    }
}

// ProfileService.java
class ProfileService {
    public void updateProfile(User user) {
        // Logic to update user profile
    }

    public void changePassword(User user, String newPassword) {
        // Logic to change user's password
    }
}

// Question.java
class Question {
    private String questionText;
    private List<String> options;
    private String correctAnswer;
    // Other question attributes, getters, and setters
}

// ExamService.java
class ExamService {
    private List<Question> questions;
    private User user;

    public ExamService(User user, List<Question> questions) {
        this.user = user;
        this.questions = questions;
    }

    public void startExam() {
        // Logic to display questions and handle user answers
    }
}

// ConsoleUI.java
class ConsoleUI {
    // Logic for interacting with users via console
}

// Timer.java
class Timer {
    // Logic to manage exam timer
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // Application entry point
    }
}