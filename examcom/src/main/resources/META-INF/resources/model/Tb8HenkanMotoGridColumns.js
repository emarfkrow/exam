/**
 * 変換元グリッド定義
 */

let Tb8HenkanMotoGridColumns = [];

$(function() {
    Tb8HenkanMotoGridColumns = [
        Column.text('HENKAN_MOTO_ID', Messages['Tb8HenkanMotoGrid.henkanMotoId'], 80, 'primaryKey numbering', null),
        Column.text('HENKAN_MOTO_INFO', Messages['Tb8HenkanMotoGrid.henkanMotoInfo'], 300, '', null),
        Column.text('HIKITSUGU_INFO', Messages['Tb8HenkanMotoGrid.hikitsuguInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb8HenkanMotoGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb8HenkanMotoGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb8HenkanMotoGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
