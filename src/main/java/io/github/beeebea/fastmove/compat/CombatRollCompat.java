package io.github.beeebea.fastmove.compat;

public class CombatRollCompat {

    public static void useCombatRollStamina(){
        var client = net.minecraft.client.MinecraftClient.getInstance();
        ((net.combatroll.client.MinecraftClientExtension)client).getRollManager().onRoll(client.player);

    }
    public static boolean hasCombatRollStamina(){
        var client = net.minecraft.client.MinecraftClient.getInstance();
        return ((net.combatroll.client.MinecraftClientExtension)client).getRollManager().isRollAvailable(client.player);
    }
}
