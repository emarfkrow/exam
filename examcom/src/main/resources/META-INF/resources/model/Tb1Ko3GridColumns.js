/**
 * 子３グリッド定義
 */

let Tb1Ko3GridColumns = [];

$(function() {
    Tb1Ko3GridColumns = [
        Column.comma('OYA_ID', Messages['Tb1Ko3Grid.oyaId'], 80, 'primaryKey numbering', null),
        Column.comma('KO_BN', Messages['Tb1Ko3Grid.koBn'], 80, 'primaryKey numbering', null),
        Column.text('KO3_INFO', Messages['Tb1Ko3Grid.ko3Info'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb1Ko3Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb1Ko3Grid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb1Ko3Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
