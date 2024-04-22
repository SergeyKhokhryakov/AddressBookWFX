package ru.ostrovcy.addressbookwfx.mvci;

import ca.pragmaticcoding.widgetsfx.mvci.MvciControllerBase;
import ca.pragmaticcoding.widgetsfx.mvci.MvciInteractor;
import javafx.scene.layout.Region;
import javafx.util.Builder;
import org.jetbrains.annotations.NotNull;
import ru.ostrovcy.addressbookwfx.mvci.model.PresentationModelClass;

public class Controller extends MvciControllerBase<PresentationModelClass> {


    @NotNull
    @Override
    protected MvciInteractor<PresentationModelClass> getInteractor() {
        return null;
    }

    @NotNull
    @Override
    protected Builder<Region> getViewBuilder() {
        return null;
    }
}