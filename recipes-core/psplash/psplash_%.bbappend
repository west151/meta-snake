DEPENDS += "gdk-pixbuf-native"

PRINC = "8"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://psplash-colors.h \
            file://psplash-bar-img.png"

SPLASH_IMAGES_rpi = "file://psplash-snake-img.h;outsuffix=raspberrypi"

# The core psplash recipe is only designed to deal with modifications to the
# 'logo' image; we need to change the bar image too, since we are changing
# colors
do_configure_append () {
        cd ${S}
        #cp ../psplash-colors.h ./
        # strip the -img suffix from the bar png -- we could just store the
        # file under that suffix-less name, but that would make it confusing
        # for anyone updating the assets
        #cp ../psplash-bar-img.png ./psplash-bar.png
        #./make-image-header.sh ./psplash-bar.png BAR
        #./make-image-header.sh ./psplash-bar.png POKY
}

