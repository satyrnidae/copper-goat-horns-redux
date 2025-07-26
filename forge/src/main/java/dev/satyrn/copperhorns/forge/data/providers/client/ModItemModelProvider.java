package dev.satyrn.copperhorns.forge.data.providers.client;

import dev.satyrn.copperhorns.CopperHorns;
import dev.satyrn.copperhorns.item.ModItems;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(final @NotNull DataGenerator generator,
                                final @NotNull String modId,
                                final @NotNull ExistingFileHelper existingFileHelper) {
        super(generator, modId, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        this.basicItem(ModItems.COPPER_GOAT_HORN.get())
                .transforms()
                .transform(ItemTransforms.TransformType.THIRD_PERSON_RIGHT_HAND)
                .rotation(0, 180, 0)
                .translation(0, 3, 1)
                .scale(0.55F, 0.55F, 0.55F)
                .end()
                .transform(ItemTransforms.TransformType.THIRD_PERSON_LEFT_HAND)
                .rotation(0, 0, 0)
                .translation(0, 3, 1)
                .scale(0.55F, 0.55F, 0.55F)
                .end()
                .transform(ItemTransforms.TransformType.FIRST_PERSON_RIGHT_HAND)
                .rotation(0, -90, 25)
                .translation(1.13F, 3.2F, 1.13F)
                .scale(0.68F, 0.68F, 0.68F)
                .end()
                .transform(ItemTransforms.TransformType.FIRST_PERSON_LEFT_HAND)
                .rotation(0, 90, -25)
                .translation(1.13F, 3.2F, 1.13F)
                .scale(0.68F, 0.68F, 0.68F)
                .end()
                .end()
                .override()
                .predicate(new ResourceLocation("tooting"), 1)
                .model(this.getBuilder(new ResourceLocation(CopperHorns.MOD_ID, "tooting_copper_horn").toString())
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", new ResourceLocation(CopperHorns.MOD_ID,
                                "item/" + ModItems.COPPER_GOAT_HORN.getId().getPath()))
                        .transforms()
                        .transform(ItemTransforms.TransformType.THIRD_PERSON_RIGHT_HAND)
                        .rotation(0, -125, 0)
                        .translation(-1, 2, 2)
                        .scale(0.5F, 0.5F, 0.5F)
                        .end()
                        .transform(ItemTransforms.TransformType.THIRD_PERSON_LEFT_HAND)
                        .rotation(0, 55, 0)
                        .translation(-1, 2, 2)
                        .scale(0.5F, 0.5F, 0.5F)
                        .end()
                        .transform(ItemTransforms.TransformType.FIRST_PERSON_RIGHT_HAND)
                        .rotation(0, -55, -5)
                        .translation(-1, -2.5F, -7.5F)
                        .end()
                        .transform(ItemTransforms.TransformType.FIRST_PERSON_LEFT_HAND)
                        .rotation(0, 115, 5)
                        .translation(0, -2.5F, -7.5F)
                        .end()
                        .end());

    }

    @Override
    public @NotNull String getName() {
        return CopperHorns.MOD_FRIENDLY_NAME + " Model Provider";
    }
}
