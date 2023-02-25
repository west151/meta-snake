USE_WEBENGINE = " \
    qtwebengine-dev \
    qtwebengine-mkspecs \
    qtwebengine \
"
USE_CHARTS = " \
    qtcharts \
    qtcharts-dev \
    qtcharts-mkspecs \
"

RDEPENDS_${PN}_remove = " \
    qtwebkit-dev \
    qtwebkit-mkspecs \
    qtwebkit-qmlplugins \
"

RDEPENDS_${PN} += " \
    ${USE_CHARTS} \
"
