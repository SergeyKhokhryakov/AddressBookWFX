package ru.ostrovcy.addressbookwfx.mvci;

import ca.pragmaticcoding.widgetsfx.mvci.MvciViewBuilder;
import javafx.scene.layout.Region;

public class View extends MvciViewBuilder<Region> {

    public View(Region viewModel) {
        super(viewModel);
    }

    @Override
    public Region build() {
        return null;
    }
}
