package me.joesvart.lattemeetup.util.menu.button;

import lombok.AllArgsConstructor;
import me.joesvart.lattemeetup.util.chat.CC;
import me.joesvart.lattemeetup.util.menu.Button;
import me.joesvart.lattemeetup.util.menu.Menu;
import me.joesvart.lattemeetup.util.other.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

@AllArgsConstructor
public class BackButton extends Button {

    private final Menu back;

    @Override
    public ItemStack getButtonItem(Player player) {
        return new ItemBuilder(Material.REDSTONE)
            .name(CC.RED + CC.BOLD + "Back")
            .lore(Arrays.asList(
                CC.RED + "Click here to return to",
                CC.RED + "the previous menu.")
            )
            .build();
    }

    @Override
    public void clicked(Player player, ClickType clickType) {
        Button.playNeutral(player);
        back.openMenu(player);
    }

}
