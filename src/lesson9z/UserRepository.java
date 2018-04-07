package lesson9z;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User save(User user) {
        if (user != null) {
            if (findById(user.getId()) == null && users.length > (getUserNames().length)) {
                for (int i = 0; i < users.length; i++) {
                    if (users[i] == null) {
                        users[i] = user;
                        return users[i];
                    }
                }
            }
        }
        return null;
    }

    public User update(User user) {
        if (user != null) {
            if (findById(user.getId()) != null) {
                for (int i = 0; i < users.length; i++) {
                    if (users[i] != null) {
                        if (users[i].getId() == user.getId()) {
                            users[i] = user;
                            return users[i];
                        }
                    }
                }
            }
        }
        return null;
    }

    public void delete(long id) {
        if (findById(id) != null) {
            for (int i = 0; i < users.length; i++) {
                if (users[i] != null) {
                    if (users[i].getId() == id) {
                        users[i] = null;
                    }
                }
            }
        }
    }

    public User[] getUsers() {
        return users;
    }

    public String[] getUserNames() {
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                count++;
            }
        }
        String[] userNames = new String[count];
        int k = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                userNames[k] = users[i].getName();
                k++;
            }
        }
        return userNames;
    }

    public long[] getUserIds() {
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                count++;
            }
        }
        long[] userIds = new long[count];
        int k = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                userIds[k] = users[i].getId();
                k++;
            }
        }
        return userIds;
    }

    public String getUserNameById(long id) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                if (users[i].getId() == id)
                    return users[i].getName();
            }
        }
        return null;
    }

    public User getUserByName(String name) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                if (users[i].getName() == name)
                    return users[i];
            }
        }
        return null;
    }

    public User findById(long id) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                if (users[i].getId() == id)
                    return users[i];
            }
        }
        return null;
    }

    public User getUserBySessionId(String sessionId) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                if (users[i].getSessionId() == sessionId)
                    return users[i];
            }
        }
        return null;
    }
}
