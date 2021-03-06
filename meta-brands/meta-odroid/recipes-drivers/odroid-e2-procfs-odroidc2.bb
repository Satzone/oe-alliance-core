SUMMARY = "odroid Enigma2 procfs drivers for ${MACHINE}"
SECTION = "base"
PRIORITY = "required"
LICENSE = "CLOSED"
require conf/license/license-close.inc

KV = "3.14.79"
SRCDATE = "20161023"

PV = "${KV}+${SRCDATE}"
PR = "r1"


SRC_URI = "file://odroid-e2-procfs-${KV}-${SRCDATE}.zip"

S = "${WORKDIR}"

inherit module

do_compile() {
}

do_install() {
    install -d ${D}${nonarch_base_libdir}/modules/${KV}/extra
    install -m 0755 ${WORKDIR}/e2-procfs.ko ${D}${nonarch_base_libdir}/modules/${KV}/extra/
}

do_package_qa() {
}

