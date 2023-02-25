SRCREV = "648ffc470824c43eb0d16c485f4c24816b32cd6f"

do_deploy_append() {
    #if [ -n "${DISABLE_SPLASH}" ]; then
    #    sed -i '/#disable_splash=/ c\disable_splash=${DISABLE_SPLASH}' ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    #fi

    # HDMI display rotation
    # 0 = none, 1 = 90cw, 2 = 180cw, 3 = 270cw, 0x10000 = hflip, 0x20000 = vflip
    #if [ -n "${DISPLAY_ROTATE}" ]; then
    #    sed -i '/#display_rotate=/ c\display_rotate=${DISPLAY_ROTATE}' ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    #fi

    if [ -n "${ENABLE_RPI3_SERIAL_CONSOLE}" ]; then
        echo "" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
        echo "dtoverlay=pi3-disable-bt" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    fi

    # disable splash
    sed -i '/#disable_splash=/ c\disable_splash=1' ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    # enable I2C
    sed -i '/#dtparam=i2c_arm=/ c\dtparam=i2c_arm=on' ${DEPLOYDIR}/bcm2835-bootfiles/config.txt

    echo "dispmanx_offline=1" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "hdmi_force_hotplug=1" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "hdmi_group=2" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "hdmi_mode=87" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "hdmi_cvt=1024 600 60 3 0 0 0" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
}
