package com.actdigital.challenges.mapping.models.db.blocks;

import com.actdigital.challenges.mapping.models.db.Image;

public class ImageBlock extends ArticleBlock {

    private Image image;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
