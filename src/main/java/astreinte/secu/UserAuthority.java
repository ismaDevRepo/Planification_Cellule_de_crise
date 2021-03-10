package astreinte.secu;

public enum UserAuthority {

    AGENT_READ("agent:read"),
    AGENT_WRITE("agent:write"),
    GESTTIONNAIRE_READ("gestionnaire:read"),
    GESTIONNAIRE_WRITE("gestionnaire:write");

    private final String permission;

    UserAuthority(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
