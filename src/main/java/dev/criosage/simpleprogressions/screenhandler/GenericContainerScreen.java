package dev.criosage.simpleprogressions.screenhandler;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.criosage.simpleprogressions.SimpleProgressions;
import dev.criosage.simpleprogressions.block.custom.ChestType;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class GenericContainerScreen extends HandledScreen<GenericContainerScreenHandler> {
    //A path to the gui texture. In this example we use the texture from the dispenser
    ChestType type;
    private static Identifier Texture(ChestType type) {
        return switch (type) {
            case COPPER -> new Identifier(SimpleProgressions.MOD_ID, "textures/gui/container/generic_36.png");
            case IRON -> new Identifier(SimpleProgressions.MOD_ID, "textures/gui/container/generic_54.png");
            case GOLD -> new Identifier(SimpleProgressions.MOD_ID, "textures/gui/container/generic_72.png");
            case DIAMOND -> new Identifier(SimpleProgressions.MOD_ID, "textures/gui/container/generic_88.png");
            case NETHERITE -> new Identifier(SimpleProgressions.MOD_ID, "textures/gui/container/generic_104.png");
            default -> new Identifier(SimpleProgressions.MOD_ID, "textures/gui/container/generic_36.png");
        };
    }

    public GenericContainerScreen(GenericContainerScreenHandler handler, PlayerInventory inventory, Text title, ChestType type) {
        super(handler, inventory, title);
        this.backgroundWidth = type.getGuiBackgroundWidth();
        this.backgroundHeight = type.getGuiBackgroundHeight();
        this.playerInventoryTitleX = type.getGuiPlayerInventoryTitleX();
        this.playerInventoryTitleY = type.getGuiPlayerInventoryTitleY();
        this.titleX = type.getGuiTitleX();
        this.titleY = type.getGuiTitleY();
        this.type = type;
    }

    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, Texture(type));
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;
        drawTexture(matrices, x, y, 0, 0, backgroundWidth, backgroundHeight);
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
        drawMouseoverTooltip(matrices, mouseX, mouseY);
    }

    @Override
    protected void init() {
        super.init();
        // Center the title
        titleX = (backgroundWidth - textRenderer.getWidth(title)) / 2;
    }
}
