/**
 * 子３グリッド定義
 */

let Tb1Ko3GridColumns = [];

$(function() {
    Tb1Ko3GridColumns = [
        Column.text('OYA_ID', Messages['Tb1Ko3Grid.oyaId'], 90, 'primaryKey numbering', null),
        Column.text('KO_BN', Messages['Tb1Ko3Grid.koBn'], 90, 'primaryKey numbering', null),
        Column.text('KO3_INFO', Messages['Tb1Ko3Grid.ko3Info'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb1Ko3Grid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
