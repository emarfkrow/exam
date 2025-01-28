/**
 * 履歴グリッド定義
 */

let Tb1KoRirekiGridColumns = [];

$(function() {
    Tb1KoRirekiGridColumns = [
        Column.cell('OYA_ID', Messages['Tb1KoRirekiGrid.oyaId'], 80, 'primaryKey numbering', null),
        Column.cell('KO_BN', Messages['Tb1KoRirekiGrid.koBn'], 80, 'primaryKey numbering', null),
        Column.cell('RIREKI_BN', Messages['Tb1KoRirekiGrid.rirekiBn'], 80, 'primaryKey numbering', null),
        Column.cell('KO_INFO', Messages['Tb1KoRirekiGrid.koInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb1KoRirekiGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.cell('DELETE_F', Messages['Tb1KoRirekiGrid.deleteF'], 30, '', null),
        Column.cell('STATUS_KB', Messages['Tb1KoRirekiGrid.statusKb'], 30, '', null),
    ];
});
