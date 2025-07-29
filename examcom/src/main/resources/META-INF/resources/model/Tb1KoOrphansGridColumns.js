/**
 * 孤児グリッド定義
 */

let Tb1KoOrphansGridColumns = [];

$(function() {
    Tb1KoOrphansGridColumns = [
        Column.text('OYA_ID', Messages['Tb1KoOrphansGrid.oyaId'], 90, 'primaryKey numbering', null),
        Column.text('KO_BN', Messages['Tb1KoOrphansGrid.koBn'], 90, 'primaryKey numbering', null),
        Column.text('KO3_INFO', Messages['Tb1KoOrphansGrid.ko3Info'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb1KoOrphansGrid.updateTs'], 207, 'metaInfo optLock', Slick.Formatters.Extends.Timestamp),
    ];
});
