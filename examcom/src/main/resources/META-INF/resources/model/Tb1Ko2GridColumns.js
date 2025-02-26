/**
 * 子２グリッド定義
 */

let Tb1Ko2GridColumns = [];

$(function() {
    Tb1Ko2GridColumns = [
        Column.text('OYA_ID', Messages['Tb1Ko2Grid.oyaId'], 80, 'primaryKey numbering', null),
        Column.text('KO_BN', Messages['Tb1Ko2Grid.koBn'], 80, 'primaryKey numbering', null),
        Column.text('KO2_INFO', Messages['Tb1Ko2Grid.ko2Info'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb1Ko2Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb1Ko2Grid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb1Ko2Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
