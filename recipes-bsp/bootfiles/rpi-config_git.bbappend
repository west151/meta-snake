
do_deploy:append() {
    if [ -n "${ENABLE_IO_BOARD}" ]; then
        echo "# IO Board params (ENABLE_IO_BOARD)" >> ${DEPLOYDIR}/bootfiles/config.txt
        echo "dtoverlay=dwc2" >> ${DEPLOYDIR}/bootfiles/config.txt
        echo "dr_mode=host" >> ${DEPLOYDIR}/bootfiles/config.txt
    fi
}
