/**
 * 履歴先グリッド定義
 */

let Tb3RirekiSakiGridColumns = [];

$(function() {
    Tb3RirekiSakiGridColumns = [
        Column.cell('RIREKI_MOTO_ID', Messages['Tb3RirekiSakiGrid.rirekiMotoId'], 80, 'primaryKey numbering', null),
        Column.cell('RIREKI_BN', Messages['Tb3RirekiSakiGrid.rirekiBn'], 80, 'primaryKey numbering', null),
        Column.cell('RIREKI_MOTO_INFO', Messages['Tb3RirekiSakiGrid.rirekiMotoInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb3RirekiSakiGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.cell('DELETE_F', Messages['Tb3RirekiSakiGrid.deleteF'], 30, '', null),
        Column.cell('STATUS_KB', Messages['Tb3RirekiSakiGrid.statusKb'], 30, '', null),
    ];
});
