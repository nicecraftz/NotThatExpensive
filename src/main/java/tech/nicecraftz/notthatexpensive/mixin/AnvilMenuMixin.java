package tech.nicecraftz.notthatexpensive.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.world.inventory.AnvilMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(AnvilMenu.class)
public class AnvilMenuMixin {

//    @ModifyArgs(
//            method = "createResult",
//            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/inventory/DataSlot;set(I)V")
//    )
//    private void injected(Args args) {
//        int cost = args.get(0);
//        args.set(0, cost >= 40 ? 39 : cost);
//    }

    @ModifyExpressionValue(
            method = "createResult",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/inventory/DataSlot;get()I")
    )
    private int injected(int cost) {
        return cost >= 40 ? 39 : cost;
    }
}
