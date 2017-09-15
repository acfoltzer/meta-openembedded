HOMEPAGE = "http://mesonbuild.com"
SUMMARY = "A high performance build system"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = " \
    git://github.com/acfoltzer/meson.git;branch=boost-cross-fix \
"

SRCREV = "b1fbd96d9f13b9e8872af7ebf4b568f0a4cdfc71"

S = "${WORKDIR}/git"

inherit setuptools3

RDEPENDS_${PN}_class-target = "ninja python3-core python3-modules"

BBCLASSEXTEND = "native"
