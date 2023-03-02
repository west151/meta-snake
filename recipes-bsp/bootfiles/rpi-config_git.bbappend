SRCREV = "648ffc470824c43eb0d16c485f4c24816b32cd6f"

do_deploy_append() {

    if [ -n "${DISABLE_SPLASH}" ]; then
        sed -i '/#disable_splash=/ c\disable_splash=${DISABLE_SPLASH}' ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
    fi

    #if [ -n "${DISABLE_SPLASH}" ]; then
    #    sed -i '/#disable_splash=/ c\disable_splash=${DISABLE_SPLASH}' ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    #fi

    # HDMI 0
    #if [ -n "${CONFIG_HDMI_0}" ]; then
    #    echo "" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    #    echo "# settings for exposure screen on HDMI 0" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    #    echo "[HDMI:0]" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    #    echo "hdmi_force_hotplug=1" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    #    echo "hdmi_mode=87" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    #    echo "hdmi_group=2" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    #    echo "hdmi_cvt=1024 600 60 6 0 0 0" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    #fi
}
