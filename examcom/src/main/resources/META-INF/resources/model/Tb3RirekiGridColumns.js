/**
 * 履歴元グリッド定義
 */

let Tb3RirekiGridColumns = [];

$(function() {
    Tb3RirekiGridColumns = [
        Column.text('RIREKI_MOTO_ID', Messages['Tb3RirekiGrid.rirekiMotoId'], 80, 'primaryKey numbering', null),
        Column.text('RIREKI_MOTO_INFO', Messages['Tb3RirekiGrid.rirekiMotoInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb3RirekiGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb3RirekiGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb3RirekiGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
