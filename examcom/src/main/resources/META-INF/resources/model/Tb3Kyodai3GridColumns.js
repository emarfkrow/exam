/**
 * 兄弟３グリッド定義
 */

let Tb3Kyodai3GridColumns = [];

$(function() {
    Tb3Kyodai3GridColumns = [
        Column.comma('OYA_ID', Messages['Tb3Kyodai3Grid.oyaId'], 80, 'primaryKey numbering', null),
        Column.comma('KO_BN', Messages['Tb3Kyodai3Grid.koBn'], 80, 'primaryKey numbering', null),
        Column.text('KYODAI3_INFO', Messages['Tb3Kyodai3Grid.kyodai3Info'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb3Kyodai3Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb3Kyodai3Grid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb3Kyodai3Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
