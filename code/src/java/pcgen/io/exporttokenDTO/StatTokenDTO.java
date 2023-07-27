package pcgen.io.exporttokenDTO;

import pcgen.core.PCStat;
import pcgen.core.PlayerCharacter;

public class StatTokenDTO {
    private PlayerCharacter playerCharacter;
    private PCStat stat;
    private boolean useTemp;
    private boolean useEquip;
    private boolean usePost;
    private boolean useLevel;
    private int aLevel;

    public StatTokenDTO(PlayerCharacter pc, PCStat stat, boolean useTemp, boolean useEquip, boolean usePost, boolean useLevel, int aLevel) {
        this.playerCharacter = pc;
        this.stat = stat;
        this.useTemp = useTemp;
        this.useEquip = useEquip;
        this.usePost = usePost;
        this.useLevel = useLevel;
        this.aLevel = aLevel;
    }

    public PlayerCharacter getPlayerCharacter() {
        return playerCharacter;
    }

    public void setPlayerCharacter(PlayerCharacter pc) {
        this.playerCharacter = pc;
    }

    public PCStat getStat() {
        return stat;
    }

    public void setStat(PCStat stat) {
        this.stat = stat;
    }

    public boolean isUseTemp() {
        return useTemp;
    }

    public void setUseTemp(boolean useTemp) {
        this.useTemp = useTemp;
    }

    public boolean isUseEquip() {
        return useEquip;
    }

    public void setUseEquip(boolean useEquip) {
        this.useEquip = useEquip;
    }

    public boolean isUsePost() {
        return usePost;
    }

    public void setUsePost(boolean usePost) {
        this.usePost = usePost;
    }

    public boolean isUseLevel() {
        return useLevel;
    }

    public void setUseLevel(boolean useLevel) {
        this.useLevel = useLevel;
    }

    public int getaLevel() {
        return aLevel;
    }

    public void setaLevel(int aLevel) {
        this.aLevel = aLevel;
    }
}
