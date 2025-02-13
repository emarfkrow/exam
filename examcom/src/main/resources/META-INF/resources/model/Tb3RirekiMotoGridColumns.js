/**
 * 履歴元グリッド定義
 */

let Tb3RirekiMotoGridColumns = [];

$(function() {
    Tb3RirekiMotoGridColumns = [
        Column.comma('RIREKI_MOTO_ID', Messages['Tb3RirekiMotoGrid.rirekiMotoId'], 80, 'primaryKey numbering', null),
        Column.text('RIREKI_MOTO_INFO', Messages['Tb3RirekiMotoGrid.rirekiMotoInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb3RirekiMotoGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb3RirekiMotoGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb3RirekiMotoGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
