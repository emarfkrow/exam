/**
 * 兄弟５グリッド定義
 */

let Tb3Kyodai5GridColumns = [];

$(function() {
    Tb3Kyodai5GridColumns = [
        Column.comma('OYA_ID', Messages['Tb3Kyodai5Grid.oyaId'], 80, 'primaryKey numbering', null),
        Column.comma('KO_BN', Messages['Tb3Kyodai5Grid.koBn'], 80, 'primaryKey numbering', null),
        Column.text('KYODAI5_INFO', Messages['Tb3Kyodai5Grid.kyodai5Info'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb3Kyodai5Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb3Kyodai5Grid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb3Kyodai5Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
