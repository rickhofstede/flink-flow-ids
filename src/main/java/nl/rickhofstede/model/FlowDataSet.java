package nl.rickhofstede.model;

/**
 * Data set that instantiates a set of `Flow` objects.
 *
 * @author Rick Hofstede
 */
public class FlowDataSet {

    public static final Flow[] DATA = new Flow[] {
        new Flow("123.45.67.89", 10000, "10.0.0.100", 22, 1516539000, 1516539001,  1,  60,  6, 27, 4),
        new Flow("123.45.67.89", 10001, "10.0.0.100", 22, 1516539001, 1516539002,  1,  60,  6, 27, 4),
        new Flow("123.45.67.89", 10002, "10.0.0.100", 22, 1516539002, 1516539003,  1,  63,  6, 27, 4),
        new Flow("123.45.67.89", 10003, "10.0.0.100", 22, 1516539003, 1516539004, 12, 411,  6, 27, 4),
        new Flow("123.45.67.89", 10004, "10.0.0.100", 22, 1516539004, 1516539005, 13, 421,  6, 27, 4),
        new Flow("::dead:beef",  50000, "ff00::1",    80, 1516579010, 1516579012, 42, 341,  6, 27, 6),
        new Flow("::dead:beef",  50001, "ff00::1",    80, 1516579015, 1516579017, 22, 141,  6, 27, 6),
        new Flow("::dead:beef",  50002, "ff00::1",    80, 1516579020, 1516579022, 45, 824,  6, 27, 6),
        new Flow("::dead:beef",  50003, "ff00::1",    80, 1516579025, 1516579027, 11, 112,  6, 27, 6),
        new Flow("::dead:beef",  50004, "ff00::1",    80, 1516579030, 1516579032,  6, 114,  6, 27, 6),
        new Flow("::dead:beef",  0,     "2a02::100",   0, 1516580010, 1516580010,  1,  60, 58,  0, 6),
        new Flow("::dead:beef",  0,     "2a02::101",   0, 1516580010, 1516580010,  1,  60, 58,  0, 6),
        new Flow("::dead:beef",  0,     "2a02::102",   0, 1516580010, 1516580010,  1,  60, 58,  0, 6),
        new Flow("::dead:beef",  0,     "2a02::103",   0, 1516580010, 1516580010,  1,  60, 58,  0, 6),
        new Flow("::dead:beef",  0,     "2a02::104",   0, 1516580010, 1516580010,  1,  60, 58,  0, 6),
        new Flow("::dead:beef",  0,     "2a02::105",   0, 1516580010, 1516580010,  1,  60, 58,  0, 6),
        new Flow("::dead:beef",  0,     "2a02::106",   0, 1516580010, 1516580010,  1,  60, 58,  0, 6),
        new Flow("::dead:beef",  0,     "2a02::107",   0, 1516580010, 1516580010,  1,  60, 58,  0, 6),
        new Flow("::dead:beef",  0,     "2a02::108",   0, 1516580010, 1516580010,  1,  60, 58,  0, 6),
        new Flow("::dead:beef",  0,     "2a02::109",   0, 1516580010, 1516580010,  1,  60, 58,  0, 6),
        new Flow("98.76.54.321", 45000, "10.0.0.100", 22, 1516554000, 1516554000,  3, 120,  6,  2, 4),
        new Flow("98.76.54.321", 45001, "10.0.0.110", 22, 1516554001, 1516554001,  2,  98,  6,  2, 4),
        new Flow("98.76.54.321", 45002, "10.0.0.120", 22, 1516554002, 1516554002,  2, 101,  6,  2, 4),
        new Flow("98.76.54.321", 45003, "10.0.0.130", 22, 1516554003, 1516554003,  2, 120,  6,  2, 4),
        new Flow("98.76.54.321", 45004, "10.0.0.140", 22, 1516554004, 1516554004,  3, 120,  6,  2, 4),
        new Flow("98.76.54.321", 45005, "10.0.0.150", 22, 1516554005, 1516554005,  3, 120,  6,  2, 4),
        new Flow("98.76.54.321", 45006, "10.0.0.160", 22, 1516554006, 1516554006,  3, 120,  6,  2, 4),
        new Flow("98.76.54.321", 45007, "10.0.0.170", 22, 1516554007, 1516554007,  3, 120,  6,  2, 4),
        new Flow("98.76.54.321", 45008, "10.0.0.180", 22, 1516554008, 1516554008,  3, 120,  6,  2, 4),
        new Flow("98.76.54.321", 45009, "10.0.0.190", 22, 1516554009, 1516554009,  3, 120,  6,  2, 4),
        new Flow("98.76.54.321", 55000, "10.0.0.200", 22, 1516555000, 1516539001, 12, 720,  6, 27, 4),
        new Flow("98.76.54.321", 55001, "10.0.0.200", 22, 1516555001, 1516539002, 12, 722,  6, 27, 4),
        new Flow("98.76.54.321", 55002, "10.0.0.200", 22, 1516555002, 1516539003, 14, 721,  6, 27, 4),
        new Flow("98.76.54.321", 55003, "10.0.0.200", 22, 1516555003, 1516539004, 13, 801,  6, 27, 4),
        new Flow("98.76.54.321", 55004, "10.0.0.200", 22, 1516555004, 1516539005, 13, 722,  6, 27, 4),
        new Flow("98.76.54.321", 55005, "10.0.0.200", 22, 1516555005, 1516539001, 12, 720,  6, 27, 4),
        new Flow("98.76.54.321", 55006, "10.0.0.200", 22, 1516555006, 1516539002, 12, 722,  6, 27, 4),
        new Flow("98.76.54.321", 55007, "10.0.0.200", 22, 1516555007, 1516539003, 14, 721,  6, 27, 4),
        new Flow("98.76.54.321", 55008, "10.0.0.200", 22, 1516555008, 1516539004, 13, 801,  6, 27, 4),
        new Flow("98.76.54.321", 55009, "10.0.0.200", 22, 1516555009, 1516539005, 13, 722,  6, 27, 4),
        new Flow("98.76.54.321", 55010, "10.0.0.200", 22, 1516555010, 1516539001, 12, 720,  6, 27, 4),
        new Flow("98.76.54.321", 55011, "10.0.0.200", 22, 1516555011, 1516539002, 12, 722,  6, 27, 4),
        new Flow("98.76.54.321", 55012, "10.0.0.200", 22, 1516555012, 1516539003, 14, 721,  6, 27, 4),
        new Flow("98.76.54.321", 55013, "10.0.0.200", 22, 1516555013, 1516539004, 13, 801,  6, 27, 4),
        new Flow("98.76.54.321", 55014, "10.0.0.200", 22, 1516555014, 1516539005, 13, 722,  6, 27, 4),
        new Flow("98.76.54.321", 55015, "10.0.0.200", 22, 1516555015, 1516539001, 12, 720,  6, 27, 4),
        new Flow("98.76.54.321", 55016, "10.0.0.200", 22, 1516555016, 1516539002, 12, 722,  6, 27, 4),
        new Flow("98.76.54.321", 55017, "10.0.0.200", 22, 1516555017, 1516539003, 14, 721,  6, 27, 4),
        new Flow("98.76.54.321", 55018, "10.0.0.200", 22, 1516555018, 1516539004, 13, 801,  6, 27, 4),
        new Flow("98.76.54.321", 55019, "10.0.0.200", 22, 1516555019, 1516539005, 13, 722,  6, 27, 4)
    };

}
