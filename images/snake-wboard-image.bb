SUMMARY = "Snake for WaveShare Compute Module IO Board Plus"
HOMEPAGE = "gis1501@gmail.com"
LICENSE = "MIT"

require snake-base-image.bb

MODULES_FILES = " \
    modules-files \
    script-files \
"

IMAGE_INSTALL += " \
    ${MODULES_FILES} \
"

export IMAGE_BASENAME = "snake-wboard-image"

