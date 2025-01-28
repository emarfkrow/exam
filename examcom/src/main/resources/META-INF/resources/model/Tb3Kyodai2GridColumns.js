/**
 * 兄弟２グリッド定義
 */

let Tb3Kyodai2GridColumns = [];

$(function() {
    Tb3Kyodai2GridColumns = [
        Column.comma('OYA_ID', Messages['Tb3Kyodai2Grid.oyaId'], 80, 'primaryKey numbering', null),
        Column.comma('KO_BN', Messages['Tb3Kyodai2Grid.koBn'], 80, 'primaryKey numbering', null),
        Column.text('KYODAI2_INFO', Messages['Tb3Kyodai2Grid.kyodai2Info'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb3Kyodai2Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb3Kyodai2Grid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb3Kyodai2Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
