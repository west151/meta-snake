SRCREV = "648ffc470824c43eb0d16c485f4c24816b32cd6f"

do_deploy_append() {
    # HDMI display rotation
    # 0 = none, 1 = 90cw, 2 = 180cw, 3 = 270cw, 0x10000 = hflip, 0x20000 = vflip
    #if [ -n "${DISPLAY_ROTATE}" ]; then
    #    sed -i '/#display_rotate=/ c\display_rotate=${DISPLAY_ROTATE}' ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    #fi

    if [ -n "${ENABLE_RPI3_SERIAL_CONSOLE}" ]; then
        echo "" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
        echo "dtoverlay=pi3-disable-bt" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    fi
}
